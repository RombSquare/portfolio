export default function ContactSection() {
  return (
    <section 
      style={{
        backgroundColor: "black",
        height: '40vh',
        display: 'flex',
        flexDirection: 'column',
        alignItems: 'center',
        color: "white",
      }}
    >
      <div>
        <h1 style={{textAlign: "center"}}>Contact</h1>
        <ul>
          <li>Telegram: @rombsquare</li>
          <li>Gmail: cubesquareromb@gmail.com</li>
          <li>GitHub: <a
            href="https://github.com/CubeSquareRomb"
            target="_blank"
            rel="noopener noreferrer"
            style={{ color: '#1e90ff', textDecoration: 'none' }} // blue & no underline
          >github.com/CubeSquareRomb</a></li>
        </ul>

      </div>
      
    </section>
  );
}