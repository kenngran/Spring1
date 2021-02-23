$(function (){

    $("#buttonShowInput").click(function (){
        const navn = $("#inputName").val();
        const age = parseFloat($("#inputAge").val());
            if(age<=0 || isNaN(age)) {
                alert("Age must be greater than 0!")
            } else{
                $("#pResult").text("Navn: " + navn +" Alder: " + age);
            }
    });


});