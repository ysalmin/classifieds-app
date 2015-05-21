'use strict';

angular.module('classifieds-app', [
	'ui.router',
	'ui.bootstrap',
	'ngSanitize',
	'ngResource',
	'classifieds-app.common',
	'classifieds-app.home',
	'classifieds-app.about',
	'classifieds-app.categories',
	'classifieds-app.classifieds',
	'classifieds-app.classified'
]).
config(['$urlRouterProvider','$stateProvider', function($urlRouterProvider, $stateProvider) {


	$urlRouterProvider.otherwise('/home');

}]);

//https://github.com/javascript-classified/angular-seed/blob/master/src/app/app.js