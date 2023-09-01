function addBurger(Id,Name,Price){
    $.ajax({
        url:"/api/updateBurger",
        method:"GET",
        data:{
            "p_id": Id,
            "p_name": Name,
            "p_price": Price
        },