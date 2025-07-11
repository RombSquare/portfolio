import { useState } from 'react';
import styled from 'styled-components';


const ScrollContainer = styled.div`
  max-width: 100%;
  overflow-x: auto;
  white-space: nowrap;
  padding: 20px;
  box-sizing: border-box;
  margin: 0 auto;

  -ms-overflow-style: none; /* IE and Edge */
  scrollbar-width: none; /* Firefox */

  &::-webkit-scrollbar {
    display: none; /* Chrome, Safari, Opera */
  }
`;

export default function Carousel({ images }) {
  if (!images || images.length === 0) return null;

  return (
    <ScrollContainer>
      {images.map((src, idx) => (
        <img
          key={idx}
          src={src}
          alt={`Slide ${idx + 1}`}
          style={{
            display: 'inline-block',
            marginRight: '10px',
            maxWidth: '80%',
            height: 'auto',
            maxHeight: '80vh',
            borderRadius: '10px',
          }}
        />
      ))}
    </ScrollContainer>
  );
}
