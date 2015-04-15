'use strict';

angular.module('classifieds-app.home', ['ui.router']).

config(function config($stateProvider) {

    $stateProvider
        .state('home', {
            url: '^/home',
            controller: 'HomeCtrl',
            templateUrl: 'app/home/home.tpl.html'
        });
});