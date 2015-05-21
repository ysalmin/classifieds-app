'use strict';

angular.module('classifieds-app.home', ['ui.router']).

config(function config($stateProvider) {

    $stateProvider
        .state('home', {
            url: '^/home',
            views:{
                container:{
                    controller: 'HomeCtrl',
                    templateUrl: 'app/home/home.tpl.html'
                }
            }
        });
});