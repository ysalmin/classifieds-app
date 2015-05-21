'use strict';

angular.module('classifieds-app.common.components.classifieds')

    .directive('classifiedsCategories', [function () {

        return {
            restrict: 'E',
            //   transclude: true,
            scope: {

            },
            templateUrl: 'common/components/classifieds/classifieds.tpl.html',
            //controller: 'CategoriesCtrl',
            link: function linkFn (scope, element, attrs) {

            }
        };

    }]);

