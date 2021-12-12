let login_form = document.getElementById("login-validation");

login_form.addEventListener('submit', async (e) => {
    e.preventDefault();
    e.stopPropagation();
    if (login_form.checkValidity() === true) {
        document.getElementById("submit-button");
        document.getElementById("spinner-button");
        let response = await fetch('api/alumni/login', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json;charset=utf-8'
            },
            body: JSON.stringify({
                email: document.getElementById('email').value,
                password: document.getElementById('password').value,
            })
        });
        let result = await response;
        // let result=response;
        console.log(response);
        if(result['status'] === 200){
            let data =await response.json();
            document.getElementById("submit-button");
            document.getElementById("spinner-button");

            sessionStorage.setItem('id',data['id']);
            location.href = "dashboard.html";
        }else{
            document.getElementById("submit-button");
            document.getElementById("spinner-button");

            document.getElementById("login-alert");
        }
    }
});