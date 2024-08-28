document.querySelector(".cancel-btn").addEventListener("click", function() {
    if (confirm("Voulez-vous annuler ?")) {
        document.getElementById("studentForm").reset();
    }
});

document.getElementById("studentForm").addEventListener("submit", function(event) {
    event.preventDefault();
    alert("L'élève a été enregistré avec succès !");
});
