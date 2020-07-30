



    $(document).ready(function() {
        $(".editButton").click(function(event){
        	event.preventDefault();
        	var href=$(this).attr("href");
        	$.get(href, function(country, status){ 		
        		$("#IdEdit").val(country.id);
        		$("#capitalEdit").val(country.capital);
        		$("#countryNameEdit").val(country.countryName);
        		$("#updatedByEdit").val(country.updatedBy);
        		$("#updatedOnEdit").val(country.updatedOn.substr(0,10));
        			})
            $("#editModal").modal();
            });
    });