function addBurger(productId,productName,productPrice){
    $.ajax({
        url:"/updateBurger",
        method:"POST",
        data:{productId: productId,productName: productName,productPrice: productPrice},
        success:function(response){
            console.log(response)
        },
        error:function(xhr, status, error){
            console.error(error)
        }
    });
}
