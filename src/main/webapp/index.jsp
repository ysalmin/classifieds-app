<!DOCTYPE html>
<html ng-app="classifieds-app">
<head>
    <title></title>
    <%--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">--%>
    <%--<link rel="stylesheet" href="https://bootswatch.com/paper/bootstrap.min.css">--%>
    <link rel="stylesheet" href="vendor/bootstrap/dist/css/bootstrap.css"/>
    <style type="text/css">
    </style>
</head>
<body>


<classifieds-header
        classifieds-header-title="classifieds App"
        classifieds-header-home-state="home">
    <li ui-sref-active="active"><a ui-sref="home">Home</a></li>
    <li ui-sref-active="active"><a ui-sref="categories">Categories</a></li>
    <li ui-sref-active="active"><a ui-sref="about">About</a></li>
</classifieds-header>

<div style="margin-top: 50px" ui-view="container" class="container"></div>

<%--<classifieds-footer>--%>
    <%--<li><a href="https://github.com/ysalmin/classifieds-app" target="_blank">Classifieds App</a></li>--%>
<%--</classifieds-footer>--%>


<script type="text/javascript" src="vendor/jquery/dist/jquery.js"></script>
<script type="text/javascript" src="vendor/angular/angular.js"></script>
<script type="text/javascript" src="vendor/angular-sanitize/angular-sanitize.js"></script>
<script type="text/javascript" src="vendor/angular-resource/angular-resource.js"></script>
<script type="text/javascript" src="vendor/bootstrap/dist/js/bootstrap.js"></script>
<script type="text/javascript" src="vendor/angular-ui-router/release/angular-ui-router.js"></script>
<script type="text/javascript" src="vendor/angular-bootstrap/ui-bootstrap-tpls.js"></script>


<script type="text/javascript" src="app/about/about.js"></script>
<script type="text/javascript" src="app/about/aboutCtrl.js"></script>
<script type="text/javascript" src="app/app.js"></script>
<script type="text/javascript" src="app/home/home.js"></script>
<script type="text/javascript" src="app/classifieds/classifieds.js"></script>
<script type="text/javascript" src="app/categories/categories.js"></script>
<script type="text/javascript" src="app/categories/categoriesCtrl.js"></script>


<script type="text/javascript" src="app/home/homeCtrl.js"></script>

<script type="text/javascript" src="common/common.js"></script>
<script type="text/javascript" src="common/components/components.js"></script>

<script type="text/javascript" src="common/components/footer/footer.js"></script>
<script type="text/javascript" src="common/components/footer/footerDirective.js"></script>

<script type="text/javascript" src="common/components/header/header.js"></script>
<script type="text/javascript" src="common/components/header/headerDirective.js"></script>

<script type="text/javascript" src="common/components/version/version.js"></script>
<script type="text/javascript" src="common/components/version/versionDirective.js"></script>

<script type="text/javascript" src="common/components/search/search.js"></script>
<script type="text/javascript" src="common/components/search/searchDirective.js"></script>

<script type="text/javascript" src="common/components/classifieds/classifieds.js"></script>
<script type="text/javascript" src="app/classifieds/classifiedsCtrl.js"></script>

<script type="text/javascript" src="app/classified/classified.js"></script>
<script type="text/javascript" src="app/classified/classifiedCtrl.js"></script>

<script type="text/javascript" src="common/components/version/versionInterpolateFilter.js"></script>
<script type="text/javascript" src="common/components/version/versionValue.js"></script>

<script type="text/javascript" src="common/features/abstract-entity/abstractEntity.js"></script>
<script type="text/javascript" src="common/features/features.js"></script>

<script type="text/javascript" src="common/components/categories/categories.js"></script>
<%--<script type="text/javascript" src="common/components/categories/categoriesCtrl.js"></script>--%>
<script type="text/javascript" src="common/components/categories/categoriesDirective.js"></script>

<script type="text/javascript" src="common/features/categories/categories.js"></script>
<script type="text/javascript" src="common/features/categories/categoriesFct.js"></script>

<script type="text/javascript" src="common/features/classifieds/classifieds.js"></script>
<script type="text/javascript" src="common/features/classifieds/classifiedsFct.js"></script>
</body>
</html>