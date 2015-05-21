'use strict';

angular.module('classifieds-app.classified', ['ui.router']).

    config(function config($stateProvider) {

        $stateProvider
            .state('categories.classifieds.classified', {
                url: '/:id',
                templateUrl: 'app/classified/classified.tpl.html',
                controller: 'ClassifiedCtrl'
            });

    });