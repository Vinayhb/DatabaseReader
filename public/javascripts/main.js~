var app = angular.module('DBReader', []);
app.run(function($rootScope) {
  $rootScope.name = "Ari Lerner";
});
app.controller('MyController',['$scope','$http', function($scope,$http) {
  $scope.person = {
    name: "Ari Lerner"
  };
$scope.sendPost = function() {
var dataToPost = {hostname: "127.0.0.1", port: "9042"}; /* PostData*/
    //var queryParams = {params: {op: 'saveEmployee'}};/* Query Parameters*/
    $http.post("http://127.0.0.1:9000/connectToCassandra", dataToPost)
            .success(function(serverResponse, status) {
                // Updating the $scope postresponse variable to update theview
                $scope.person.name = serverResponse;
            });
}
}]);
