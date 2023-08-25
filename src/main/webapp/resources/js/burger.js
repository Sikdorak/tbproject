// function addBurger(productId,productName,productPrice){
function addBurger(Id,Name,Price){
    $.ajax({
        url:"/api/updateBurger",
        method:"GET",
        // contentType:"application/json",
        data:{
            "p_id": "burger",
            "p_name": "drink",
            "p_price": 1
        },
        // data: JSON.stringify({
        //     productId: Id,
        //     productName: Name,
        //     productPrice: Price
        // }),
        // dataType:"json",
        success:function(response){
            $("#orderList").text(response.p_name + " " + response.p_price)
        },
        error:function(xhr, status, error){
            console.error(error)
        }
    });
}
