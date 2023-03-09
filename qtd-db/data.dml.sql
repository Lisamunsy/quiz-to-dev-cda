DELETE FROM topics;

INSERT INTO topics
	(name, parent_topic_id)
	VALUES
	('Root', null);