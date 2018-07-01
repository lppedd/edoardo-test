angular.module("edoardoTest").controller("userController", function ($scope, userFactory) {
	userFactory.allUsers().then(function (response) {
		$scope.users = response.data;
	});
});
