'use strict';

angular.module('classifieds-app.classifieds', ['ui.router']).

    config(function config($stateProvider) {

        $stateProvider
            .state('classifieds', {
                url: '^/classifieds',
                templateUrl: 'app/classifieds/classifieds.tpl.html'
            });
    });