function Tag({ text, bgColor }) {
  return (
    <span style={{
      display: 'inline-block',
      backgroundColor: bgColor,
      color: 'white',
      padding: '2px 8px',
      fontSize: '12px',
      fontWeight: '600',
      borderRadius: '8px',
      marginRight: '8px',
      userSelect: 'none',
    }}>
      {text}
    </span>
  );
}

export default function TagList({ tags, bgColor }) {
  if (tags === undefined) {
    return
  }

  return (
    <div>
      {tags.map((tag, idx) => (
        <Tag key={idx} text={tag} bgColor={bgColor} />
      ))}
    </div>
  );
}
