import React from 'react'
import 'react-modern-drawer/dist/index.css'
import { Link } from "react-router-dom";
import Section from './components/Section';
import AboutSection from './components/AboutSection';
import ContactSection from './components/ContactSection';

import solocards1 from './assets/screenshots/solocards/1.png';
import solocards2 from './assets/screenshots/solocards/2.png';
import solocards3 from './assets/screenshots/solocards/3.png';
import solocards4 from './assets/screenshots/solocards/4.png';
import solocards5 from './assets/screenshots/solocards/5.png';
import solocards6 from './assets/screenshots/solocards/6.png';

import equadratic1 from './assets/screenshots/equadratic/1.png';
import equadratic2 from './assets/screenshots/equadratic/2.png';
import equadratic3 from './assets/screenshots/equadratic/3.png';

import mentamath1 from './assets/screenshots/mentamath/1.png';
import mentamath2 from './assets/screenshots/mentamath/2.png';
import mentamath3 from './assets/screenshots/mentamath/3.png';

import notes1 from './assets/screenshots/notes/1.png';
import notes2 from './assets/screenshots/notes/2.png';

import rancol1 from './assets/screenshots/rancol/1.png';
import rancol2 from './assets/screenshots/rancol/2.png';
import rancol3 from './assets/screenshots/rancol/3.png';

const solocardsScreenshots = [
  solocards1,
  solocards2,
  solocards3,
  solocards4,
  solocards6
]

const equadraticScreenshots = [
  equadratic1,
  equadratic2,
  equadratic3
]

const mentamathScreenshots = [
  mentamath1,
  mentamath2,
  mentamath3
]

const notesScreenshots = [
  notes1,
  notes2
]

const rancolScreenshots = [
  rancol1,
  rancol2,
  rancol3
]

function Home() {
  return (
    <div className="App" style={{display: 'flex', flexDirection: 'column', justifyContent: 'space-between'}}>
      <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Portfolio</title>
        <link rel="icon" href="https://img.icons8.com/tiny-glyph/16/code.png" />
      </head>

      <div>
        <main className="intro">
          <div>
            <div style={{textAlign: "center", fontWeight: "bold", fontSize: "32px"}}>RombSquare</div>
            <div style={{textAlign: "center"}}>Mobile Developer</div>
          </div>
        </main>

        <AboutSection />

        <Section 
          title="Solocards"
          descr="The app is about solving and creating quizzes with different game modes"
          bgColor="#008a49" 
          textColor="white"
          screenshots={solocardsScreenshots}
          tags={["TOP", "Jetpack", "Kotlin", "Firestore", "Auth", "Room", "Quiz app", "CRUD"]}
          tagBg="#004a27"
          codeLink="https://github.com/CubeSquareRomb/solocards"
        />

        <Section 
          title="Equadratic"
          descr="The math game is about solving quadratic equations at speed with user-friendly tutorial"
          bgColor="#222" 
          textColor="white"
          screenshots={equadraticScreenshots}
          tags={["Jetpack", "Kotlin", "Puzzle", "Math"]}
          tagBg="black"
          codeLink="https://github.com/CubeSquareRomb/equadratic"
          whiteIcons={true}
        />

        <Section 
          title="Mentamath"
          descr="The game that trains your mental math skills"
          bgColor="#40ccff"
          textColor="black"
          screenshots={mentamathScreenshots}
          tags={["Jetpack", "Kotlin", "Puzzle", "Math"]}
          tagBg="#00658a"
          codeLink="https://github.com/CubeSquareRomb/mentamath"
        />

        <Section 
          title="Simple Notes"
          descr="Simple note-taking app made with Flutter and with basic CRUD operations"
          bgColor="#ffbb00"
          textColor="black"
          screenshots={notesScreenshots}
          tags={["Flutter", "Note", "CRUD", "SQFLite"]}
          tagBg="#8f6900"
          codeLink="https://github.com/CubeSquareRomb/notes"
        />

        <Section 
          title="Rancol"
          descr="One-tap random color generator"
          bgColor="#d400ff"
          textColor="black"
          screenshots={rancolScreenshots}
          tags={["Jetpack", "Kotlin", "One tap", "Simple", "Animations"]}
          tagBg="#8800a3"
          codeLink="https://github.com/CubeSquareRomb/rancol"
        />

        <ContactSection />
    </div>
    </div>
  );
}

export default Home;
