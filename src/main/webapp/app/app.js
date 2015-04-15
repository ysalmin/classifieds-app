'use strict';

angular.module('classifieds-app', [
	'ui.router',
	'ui.bootstrap',
	'ngSanitize',
	'ngResource',
	'classifieds-app.common',
	'classifieds-app.home',
	'classifieds-app.about',
	'classifieds-app.classifieds'
]).
config(['$urlRouterProvider','$stateProvider', function($urlRouterProvider, $stateProvider) {

		$stateProvider
			.state('classifieds.categories', {
				url: '/categories/:id'
			});
	$urlRouterProvider.otherwise('/home');

}]);

//https://github.com/javascript-classified/angular-seed/blob/master/src/app/app.js