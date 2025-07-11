import Carousel from './Carousel';
import TagList from './TagList';
import GitHubIcon from '../assets/icons/github.png';

export default function Section({ title, descr, bgColor, textColor, screenshots, tags, tagBg, codeLink, whiteIcons=false }) {
  return (
    <section 
      style={{
        backgroundColor: bgColor,
        height: '120vh',
        display: 'flex',
        flexDirection: 'column',
        alignItems: 'center',
        color: textColor,
      }}
    >
      <div style={{
        justifyContent: 'space-between'
      }}>
        <div style={{
          padding: '10px'
        }}>
            <h1 style={{textAlign: 'center'}}>{title}</h1>
            <div>{descr}</div>
        </div>

        <div style={{padding: '10px', display: 'flex', justifyContent: 'space-between', alignItems: 'center'}}>
          <TagList tags={tags} bgColor={tagBg}/>
          <div />
          <a href={codeLink} target="_blank" rel="noopener noreferrer">
            <button style={{
              border: 'none',
              background: 'none'
            }}>
              <img 
                src={GitHubIcon} 
                alt="icon" 
                style={{ width: '40px', height: '40px', filter: whiteIcons ? 'invert(1)' : 'invert(0)' }} 
              />
            </button>
          </a>
        </div>

        <Carousel images={screenshots}/>
      </div>
      
    </section>
  );
}