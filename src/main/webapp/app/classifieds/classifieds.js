'use strict';

angular.module('classifieds-app.classifieds', ['ui.router']).

    config(function config($stateProvider) {

        $stateProvider

            .state('categories.classifieds', {
                url: '/:id/classifieds',
                views:{
                    classifieds:{
                        templateUrl:'common/components/classifieds/classifieds.tpl.html',
                        controller:'ClassifiedsCtrl'
                    }
                }

            });

    });

// TODO: separated folders for classifieds and categories states !!!
// TODO: fix templates