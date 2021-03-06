package ch.fhnw.webfr.flashcard.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

@Document(collection = "questionnaires")
public class Questionnaire {
	@Id
	private String id;
	@Size(min = 2, max = 30)
	@NotNull
	private String title;
	@Size(min = 10, max = 50)
	@NotNull
	private String description;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Questionnaire))
			return false;
		Questionnaire questionnaire = (Questionnaire) o;
		return Objects.equals(this.id, questionnaire.id) && Objects.equals(this.title, questionnaire.title)
				&& Objects.equals(this.description, questionnaire.description);
	}
}
