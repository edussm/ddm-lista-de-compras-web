angular.module('br.fpu.lista.de.compras', [ 'ui.bootstrap' ])

.controller('LoginCtrl', function($scope, $modal) {

    modal_open();
    function modal_open() {
	var modalInstance = $modal.open({
	    templateUrl : '/ng-templates/loginmodal',
	    controller : 'LoginModalCtrl',
	    size : 'sm'
	});

	modalInstance.result.then(function() {
	    modal_open();
	},

	function() {
	    modal_open();
	});

    }

})

.controller('LoginModalCtrl', function($scope, $modalInstance) {

});
