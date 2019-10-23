var app = angular.module('devices', []);

app.controller("deviceController", function ($scope, $http) {

    $scope.getDevice = function () {
        var idfromurl = new URL(window.location.href);
        var idl = idfromurl.searchParams.get("id");
        var idfromurl = idl.toString();
        console.log(idfromurl);
        $http.get('/devicerest/find?id=' + idfromurl).success(function (data, status, headers, config){
            console.log(data);
            $scope.deviceList = data;
        }).error (function (data, status, headers, config){
            if (data.message ='Time is out') {
                $scope.finishByTimeout();
            }
        });
    };
});
/*
    $scope.successDeleteSchoolCallback = function (response) {
        for (var i = 0; i < $scope.schoolsList.length; i++) {
            var j = $scope.schoolsList[i];
            if (j.id === $scope.deletedId) {
                $scope.schoolsList.splice(i, 1);
                break;
            }
        }
        $scope.errormessage="";
    };

    $scope.errorDeleteSchoolCallback = function (error) {
        console.log(error);
        $scope.errormessage="Unable to delete school; check if there are any related records exist. Such records should be removed first";
    };

    $scope.deleteSchool = function (id) {
        $scope.deletedId = id;
        $http.delete('/public/rest/schools/' + id).then($scope.successDeleteSchoolCallback, $scope.errorDeleteSchoolCallback);
    };


    $scope.successGetSchoolCallback = function (response) {
        $scope.schoolsList.splice(0, 0, response.data);
        $scope.errormessage="";
    };

    $scope.errorGetSchoolCallback = function (error) {
        console.log(error);
        $scope.errormessage="Unable to get information on school number "+$scope.inputnumber;
    };

    $scope.successAddSchoolCallback = function (response) {
        $http.get('/public/rest/schools/' + $scope.inputnumber).then($scope.successGetSchoolCallback, $scope.errorGetSchoolCallback);
        $scope.errormessage="";
    };

    $scope.errorAddSchoolCallback = function (error) {
        console.log(error);
        $scope.errormessage="Impossible to add new school; check if it's number is unique";
    };

    $scope.addSchool = function () {
        $http.post('/public/rest/schools/' + $scope.inputnumber + "/" + $scope.inputname).then($scope.successAddSchoolCallback, $scope.errorAddSchoolCallback);
    };

});*/
