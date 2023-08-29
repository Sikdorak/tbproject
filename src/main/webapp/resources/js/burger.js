// function addBurger(productId,productName,productPrice){
function addBurger(Id,Name,Price){
    $.ajax({
        url:"/api/updateBurger",
        method:"GET",
        data:{
            "p_id": Id,
            "p_name": Name,
            "p_price": Price
        },
        // dataType:"json",
        success:function(response){
            console.log(response)
            for(var i = 0; i < response.length; i++)
            var menu = response[i];
            var menuData = menu.p_name + " " + menu.p_price
            $(".orderList").append(menuData)
        },
        error:function(xhr, status, error){
            console.error(error)
        }
    });
}
