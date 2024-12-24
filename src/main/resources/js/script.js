document.getElementById('contactForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent form from submitting
    const name = document.getElementById('name').value;
    alert(`Thank you for contacting us, ${name}!`);
});
