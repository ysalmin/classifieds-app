'use strict';

angular.module('classifieds-app.about', ['ui.router']).

config(function config($stateProvider) {

    $stateProvider
        .state('about', {
            url: '^/about',

            views:{
                container:{
                    controller: 'AboutCtrl',
                    templateUrl: 'app/about/about.tpl.html'
                }
            }
        });
});