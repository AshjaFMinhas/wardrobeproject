function getClosets() {
    $.get("/api/game/get", function(data) {

    console.table(data);
        var html = "";
        html = "<p>" + data.name + "</p>" +
                        "<p>" + data.openWardrobe + "</p>";
        $("#closets").html(html);
    });
}

function saveClosets(e) {
    e.preventDefault();

    var name = $("#name").val();
        console.log("name: " + name);

    $.get("/api/game/" + name, function() {
       getClosets();
    });

    var name = $("#name").val();

    $.post("/api/game/add",
        {
            name: name,
        },

        function(data, status) {
            getClosets();
                alert("Data: " + data + "\nStatus: " + status);
        });

    $("#name").val("");              //Lege input field
}

// Button functions om deur te openen/sluiten & naar binnen/buiten te lopen.
 function openDoor() {
    console.log("The door is now open");
    $("#openBtn").hide();
    $("#closeBtn").show();
    }

 function closeDoor() {
    console.log("The door is now closed");
    $("#openBtn").show();
    $("#closeBtn").hide();
    }

/*Dit is een clickhandler vor een button. Eerste deel spreek je ID van button aan/
Dan .click/tussen haakjes() wat je wil aanspreken.*/
$("#openBtn").click(openDoor);
$("#closeBtn").click(closeDoor);


$("#saveForm").submit(saveClosets);

getClosets();

