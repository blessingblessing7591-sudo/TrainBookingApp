class LoginActivity : AppCompatActivity() {

override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
setContentView(R.layout.activity_login)

val login = findViewById<Button>(R.id.loginBtn)

login.setOnClickListener {

startActivity(Intent(this, DashboardActivity::class.java))

}

}
}
