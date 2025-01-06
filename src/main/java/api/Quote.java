package api;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonProperty;

import java.util.List;

public class Quote {
  private List<String> tags;
  private Boolean favorite;

  @JsonProperty("author_permalink")
  private String authorPermalink;

  private String body;

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("favorites_count")
  private Integer favoritesCount;

  @JsonProperty("upvotes_count")
  private Integer upvotesCount;

  @JsonProperty("downvotes_count")
  private Integer downvotesCount;

  private Boolean dialogue;

  @JsonProperty("private")
  private Boolean isPrivate;

  private String author;
  private String url;
  private String source;

  public Quote() {}

  public Quote(
      List<String> tags,
      Boolean favorite,
      String authorPermalink,
      String body,
      Integer id,
      Integer favoritesCount,
      Integer upvotesCount,
      Integer downvotesCount,
      Boolean dialogue,
      Boolean isPrivate,
      String author,
      String url,
      String source) {
    this.tags = tags;
    this.favorite = favorite;
    this.authorPermalink = authorPermalink;
    this.body = body;
    this.id = id;
    this.favoritesCount = favoritesCount;
    this.upvotesCount = upvotesCount;
    this.downvotesCount = downvotesCount;
    this.dialogue = dialogue;
    this.isPrivate = isPrivate;
    this.author = author;
    this.url = url;
    this.source = source;
  }

  public List<String> getTags() {
    return tags;
  }

  public Boolean getFavorite() {
    return favorite;
  }

  public String getAuthorPermalink() {
    return authorPermalink;
  }

  public String getBody() {
    return body;
  }

  public Integer getId() {
    return id;
  }

  public Integer getFavoritesCount() {
    return favoritesCount;
  }

  public Integer getUpvotesCount() {
    return upvotesCount;
  }

  public Integer getDownvotesCount() {
    return downvotesCount;
  }

  public Boolean getDialogue() {
    return dialogue;
  }

  public Boolean getIsPrivate() {
    return isPrivate;
  }

  public String getAuthor() {
    return author;
  }

  public String getUrl() {
    return url;
  }

  public String getSource() {
    return source;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public void setFavorite(Boolean favorite) {
    this.favorite = favorite;
  }

  public void setAuthorPermalink(String authorPermalink) {
    this.authorPermalink = authorPermalink;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setFavoritesCount(Integer favoritesCount) {
    this.favoritesCount = favoritesCount;
  }

  public void setUpvotesCount(Integer upvotesCount) {
    this.upvotesCount = upvotesCount;
  }

  public void setDownvotesCount(Integer downvotesCount) {
    this.downvotesCount = downvotesCount;
  }

  public void setDialogue(Boolean dialogue) {
    this.dialogue = dialogue;
  }

  public void setIsPrivate(Boolean aPrivate) {
    isPrivate = isPrivate;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setSource(String source) {
    this.source = source;
  }
}
