angular.module("edoardoTest").factory("userFactory", function ($http) {
	function allUsers() {
		return $http.get("app/users");
	}

	return {
		allUsers: allUsers
	};
});
