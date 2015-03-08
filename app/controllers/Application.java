package controllers;

import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

import cassandraQueryIntf.CassandraReader;
import play.libs.F.Function;
import play.libs.F.Function0;
import play.libs.F.Promise;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {

	public static Result index() {
		// return ok(index.render("Your new application is ready."));
		return ok("Got request " + request() + "!");
	}

	@BodyParser.Of(BodyParser.Json.class)
	public static Promise<Result> getDataFromCassandra() {

		JsonNode requestData = request().body().asJson();

		Promise<JsonNode> response;

		final CassandraReader cassandraread = new CassandraReader(requestData
				.findPath("query").asText());

		response = Promise.promise(new Function0<JsonNode>() {
			public JsonNode apply() {
				return cassandraread.getDataFromCassandra();
			}
		});

		Promise<Result> result = response.map(new Function<JsonNode, Result>() {
			public Result apply(JsonNode json) {
				return ok(json);
			}
		});
		return result;

	}

	/*
	 * Add a Row 
	 * 
	 * The POST Json will be of the format: 
	 * {
	 * 	"row":{"columns":["col1","col2","col2"],
	 * 			"values":["val1","val2","val3"] 
	 * 		}
	 * }
	 */
	@BodyParser.Of(BodyParser.Json.class)
	public static Promise<Result> addRow(String keyspace_name, String table_name) {

		JsonNode requestData = request().body().asJson();

		Promise<JsonNode> response;
		/*
		 * Find a way to loop through all the elements in the request data and
		 * prepae a query accordingly
		 */

		StringBuilder query = new StringBuilder("INSERT INTO " + keyspace_name
				+ "." + table_name + " (");

		Iterator<JsonNode> rowDataColumns = requestData.findPath("row")
				.findPath("columns").elements();
		Iterator<JsonNode> rowDataValues = requestData.findPath("row")
				.findPath("values").elements();

		//if (rowDataColumns.size() != rowDataValues.size())
			// return ok("Not a valid insert Query"); //TODO: This is not OK!!

			while (rowDataColumns.hasNext()) {
				query.append(rowDataColumns.next().textValue());
				if (rowDataColumns.hasNext())
					query.append(",");
			}

		query.append(") VALUES (");

		while (rowDataValues.hasNext()) {
			query.append(rowDataValues.next().textValue());
			if (rowDataValues.hasNext())
				query.append(",");
		}
		query.append(")");
		play.Logger.debug("Final Query:" + query.toString());
		final CassandraReader cassandraread = new CassandraReader(
				query.toString());

		response = Promise.promise(new Function0<JsonNode>() {
			public JsonNode apply() {
				return cassandraread.executeQuery();
			}
		});

		Promise<Result> result = response.map(new Function<JsonNode, Result>() {
			public Result apply(JsonNode json) {
				return ok(json);
			}
		});
		return result;

	}
	
	/*
	 * Delete a row
	 * 
	 * The DELETE Json will be of the format: 
	 * {
	 * "row":{"columns":["col1","col2","col2"],
	 * 			"condition":"Acondition" 
	 * 		  }
	 * }
	 */
	@BodyParser.Of(BodyParser.Json.class)
	public static Promise<Result> deleteRow(String keyspace_name, String table_name) {

		JsonNode requestData = request().body().asJson();

		Promise<JsonNode> response;
		/*
		 * Find a way to loop through all the elements in the request data and
		 * prepae a query accordingly
		 */

		StringBuilder query = new StringBuilder("DELETE ");
		

		Iterator<JsonNode> rowDataColumns = requestData.findPath("row")
				.findPath("columns").elements();
		
		while (rowDataColumns.hasNext()) {
			query.append(rowDataColumns.next().textValue());
			if (rowDataColumns.hasNext())
				query.append(",");
		}
		
		query.append(" FROM " + keyspace_name
				+ "." + table_name + " WHERE " + requestData.findPath("row")
				.findPath("condition").textValue() );

		
		
		final CassandraReader cassandraread = new CassandraReader(
				query.toString());

		response = Promise.promise(new Function0<JsonNode>() {
			public JsonNode apply() {
				return cassandraread.executeQuery();
			}
		});

		Promise<Result> result = response.map(new Function<JsonNode, Result>() {
			public Result apply(JsonNode json) {
				return ok(json);
			}
		});
		return result;

	}


	/*
	 * update a Row:
	 * 
	 * The PUT Json will be of the format: 
	 * {
	 * "row":{	 "columns":["col1","col2","col2"],
	 * 			"values":["val1","val2","val3"] ,
	 * 			"condition":"Acondition" 
	 * 		  }
	 * }
	 */
	@BodyParser.Of(BodyParser.Json.class)
	public static Promise<Result> updateRow(String keyspace_name, String table_name) {

		JsonNode requestData = request().body().asJson();

		Promise<JsonNode> response;
		/*
		 * Find a way to loop through all the elements in the request data and
		 * prepae a query accordingly
		 */

		StringBuilder query = new StringBuilder("UPDATE "+ keyspace_name + "." + table_name 
				+" SET ");
		

		Iterator<JsonNode> rowDataColumns = requestData.findPath("row")
				.findPath("columns").elements();
		
		Iterator<JsonNode> rowDataValues = requestData.findPath("row")
				.findPath("values").elements();
		
		while (rowDataColumns.hasNext()) {
			query.append(rowDataColumns.next().textValue() + " = " + rowDataValues.next().textValue());
			if (rowDataColumns.hasNext())
				query.append(",");
		}
		
		query.append(" WHERE " + requestData.findPath("row")
				.findPath("condition").textValue() );

		
		
		final CassandraReader cassandraread = new CassandraReader(
				query.toString());

		response = Promise.promise(new Function0<JsonNode>() {
			public JsonNode apply() {
				return cassandraread.executeQuery();
			}
		});

		Promise<Result> result = response.map(new Function<JsonNode, Result>() {
			public Result apply(JsonNode json) {
				return ok(json);
			}
		});
		return result;

	}
}
