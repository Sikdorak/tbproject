function addBurger(Id,Name,Price){
    $.ajax({
        url:"/api/updateDrink",
        method:"GET",
        data:{
            "p_id": Id,
            "p_name": Name,
            "p_price": Price
        },
        success:function(response){
            $(".orderList").empty();
            console.log(response)
            for(var i = 0; i < response.length; i++){
                var menu = response[i];
                var menuData = menu.p_name + " " + menu.p_price + "<br>"
                $(".orderList").append(menuData);
            }
        },
        error:function(xhr, status, error){
            console.error(error)
        }
    });
}