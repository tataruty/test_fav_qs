package api;

import com.google.gson.annotations.SerializedName;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Quote {
  private List<String> tags;
  private Boolean favorite;

  @JsonProperty("author_permalink")
  private String authorPermalink;

  private String body;

  @JsonProperty("id")
  private Integer id;

  @SerializedName("favorites_count")
  private Integer favoritesCount;

  @SerializedName("upvotes_count")
  private Integer upvotesCount;

  @SerializedName("downvotes_count")
  private Integer downvotesCount;

  private Boolean dialogue;

  @SerializedName("private")
  private Boolean isPrivate;

  private String author;
  private String url;
  private String source;
}
