<html>
<body>
<h2>Hello World!</h2>
<script>
    window.onload = function (ev) {
        debugger;
        window.addEventListener('message', function (e) {
            console.log(e.origin, e.data);
        });
    };
</script>
</body>
</html>
