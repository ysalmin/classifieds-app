'use strict';

angular.module('classifieds-app.common.components.categories')

    .directive('classifiedsCategories', ['categories', function (categories) {

        return {
            restrict: 'E',
            transclude: true,
            scope: {
                //title: '@classifiedsHeaderTitle',
                //homeState: '@classifiedsHeaderHomeState'
            },
            templateUrl: 'common/components/categories/categories.tpl.html',
            controller: 'CategoriesCtrl',
            link: function linkFn (scope, element, attrs,categoriesProvider) {
                //var categories = [
                //    {
                //        "Name": "Computers",
                //        "url": "computers"
                //    },
                //    {
                //        "Name": "Clothes",
                //        "url": "clothes"
                //    },
                //    {
                //        "Name": "Another stuff",
                //        "url": "anotherstuff"
                //    }
                //
                //];
            //    var categories = categoriesProvider.$get();
           //     scope.categories = categories;
            }
        };

    }]);
