export default function AboutSection() {
  return (
    <section 
      style={{
        backgroundColor: "black",
        height: '120vh',
        display: 'flex',
        flexDirection: 'column',
        alignItems: 'center',
        color: "white",
      }}
    >
      <div>
        <h1 style={{textAlign: "center"}}>My Skills</h1>
        <ul>
          <li>Jetpack Compose</li>
          <li>Flutter</li>
          <li>Firebase: Firestore and Auth</li>
          <li>Room DB</li>
          <li>Clean Architecture</li>
          <li>Polyglot in prog langs</li>
        </ul>

      </div>
      
    </section>
  );
}