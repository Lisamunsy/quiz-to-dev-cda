DROP TABLE IF EXISTS topics;

CREATE TABLE topics (
	id SERIAL PRIMARY KEY,
	name VARCHAR(150) NOT NULL,
	parent_topic_id INTEGER,
	CONSTRAINT fk_parent_topic_id
		FOREIGN KEY (parent_topic_id)
		REFERENCES topics(id)
);