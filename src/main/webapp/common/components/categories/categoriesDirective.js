'use strict';

angular.module('classifieds-app.common.components.categories')

    .directive('classifiedsCategories', [ function () {

        return {
            restrict: 'E',
         //   transclude: true,
         //   scope: {
         //
         //   },
            templateUrl: 'common/components/categories/categories.tpl.html',
            controller: 'CategoriesCtrl',
            link: function linkFn (scope, element, attrs) {

            }
        };

    }]);
