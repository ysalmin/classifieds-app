'use strict';

angular.module('classifieds-app.categories', ['ui.router']).

    config(function config($stateProvider) {

        $stateProvider
            .state('categories', {
                url: '^/categories',
                views:{
                    container:{
                        controller:'CategoriesCtrl',
                        templateUrl: 'app/classifieds/classifieds.tpl.html'
                    }
                }


            })


    });

