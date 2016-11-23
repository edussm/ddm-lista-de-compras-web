angular.module('br.fpu.lista.de.compras', [ 'ui.bootstrap', 'ngResource' ])

.factory('Produtos', [ '$resource', function($resource) {
    return $resource('/rest/produto', {}, {
        query : {
            method : 'GET',
            cache : false,
            isArray : false
        }

    });
} ])

.controller('ProdutoCtrl', function($scope, $window, Produtos) {
	console.log("ProdutoCTRL");
    Produtos.query({}, function(data) {
	    console.log(data);

    	$scope.produtos = data.content;

		console.log($scope.produtos);
    });
});