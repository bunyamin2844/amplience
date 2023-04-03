package pojo;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "login",
        "id",
        "node_id",
        "avatar_url",
        "gravatar_id",
        "url",
        "html_url",
        "followers_url",
        "following_url",
        "gists_url",
        "starred_url",
        "subscriptions_url",
        "organizations_url",
        "repos_url",
        "events_url",
        "received_events_url",
        "type",
        "site_admin",
        "name",
        "company",
        "blog",
        "location",
        "email",
        "hireable",
        "bio",
        "twitter_username",
        "public_repos",
        "public_gists",
        "followers",
        "following",
        "created_at",
        "updated_at"
})
@Generated("jsonschema2pojo")
public class UserData {

    @JsonProperty("login")
    private String login;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("node_id")
    private String nodeId;
    @JsonProperty("avatar_url")
    private String avatarUrl;
    @JsonProperty("gravatar_id")
    private String gravatarId;
    @JsonProperty("url")
    private String url;
    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonProperty("followers_url")
    private String followersUrl;
    @JsonProperty("following_url")
    private String followingUrl;
    @JsonProperty("gists_url")
    private String gistsUrl;
    @JsonProperty("starred_url")
    private String starredUrl;
    @JsonProperty("subscriptions_url")
    private String subscriptionsUrl;
    @JsonProperty("organizations_url")
    private String organizationsUrl;
    @JsonProperty("repos_url")
    private String reposUrl;
    @JsonProperty("events_url")
    private String eventsUrl;
    @JsonProperty("received_events_url")
    private String receivedEventsUrl;
    @JsonProperty("type")
    private String type;
    @JsonProperty("site_admin")
    private Boolean siteAdmin;
    @JsonProperty("name")
    private String name;
    @JsonProperty("company")
    private Object company;
    @JsonProperty("blog")
    private String blog;
    @JsonProperty("location")
    private String location;
    @JsonProperty("email")
    private Object email;
    @JsonProperty("hireable")
    private Object hireable;
    @JsonProperty("bio")
    private Object bio;
    @JsonProperty("twitter_username")
    private Object twitterUsername;
    @JsonProperty("public_repos")
    private Integer publicRepos;
    @JsonProperty("public_gists")
    private Integer publicGists;
    @JsonProperty("followers")
    private Integer followers;
    @JsonProperty("following")
    private Integer following;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("login")
    public String getLogin() {
        return login;
    }

    @JsonProperty("login")
    public void setLogin(String login) {
        this.login = login;
    }

    public UserData withLogin(String login) {
        this.login = login;
        return this;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public UserData withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    @JsonProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public UserData withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    @JsonProperty("avatar_url")
    public String getAvatarUrl() {
        return avatarUrl;
    }

    @JsonProperty("avatar_url")
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public UserData withAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    @JsonProperty("gravatar_id")
    public String getGravatarId() {
        return gravatarId;
    }

    @JsonProperty("gravatar_id")
    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }

    public UserData withGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public UserData withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    @JsonProperty("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public UserData withHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    @JsonProperty("followers_url")
    public String getFollowersUrl() {
        return followersUrl;
    }

    @JsonProperty("followers_url")
    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    public UserData withFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
        return this;
    }

    @JsonProperty("following_url")
    public String getFollowingUrl() {
        return followingUrl;
    }

    @JsonProperty("following_url")
    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    public UserData withFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
        return this;
    }

    @JsonProperty("gists_url")
    public String getGistsUrl() {
        return gistsUrl;
    }

    @JsonProperty("gists_url")
    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    public UserData withGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
        return this;
    }

    @JsonProperty("starred_url")
    public String getStarredUrl() {
        return starredUrl;
    }

    @JsonProperty("starred_url")
    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    public UserData withStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
        return this;
    }

    @JsonProperty("subscriptions_url")
    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    @JsonProperty("subscriptions_url")
    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    public UserData withSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
        return this;
    }

    @JsonProperty("organizations_url")
    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    @JsonProperty("organizations_url")
    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    public UserData withOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
        return this;
    }

    @JsonProperty("repos_url")
    public String getReposUrl() {
        return reposUrl;
    }

    @JsonProperty("repos_url")
    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    public UserData withReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
        return this;
    }

    @JsonProperty("events_url")
    public String getEventsUrl() {
        return eventsUrl;
    }

    @JsonProperty("events_url")
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public UserData withEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    @JsonProperty("received_events_url")
    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    @JsonProperty("received_events_url")
    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    public UserData withReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public UserData withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("site_admin")
    public Boolean getSiteAdmin() {
        return siteAdmin;
    }

    @JsonProperty("site_admin")
    public void setSiteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    public UserData withSiteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public UserData withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("company")
    public Object getCompany() {
        return company;
    }

    @JsonProperty("company")
    public void setCompany(Object company) {
        this.company = company;
    }

    public UserData withCompany(Object company) {
        this.company = company;
        return this;
    }

    @JsonProperty("blog")
    public String getBlog() {
        return blog;
    }

    @JsonProperty("blog")
    public void setBlog(String blog) {
        this.blog = blog;
    }

    public UserData withBlog(String blog) {
        this.blog = blog;
        return this;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    public UserData withLocation(String location) {
        this.location = location;
        return this;
    }

    @JsonProperty("email")
    public Object getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(Object email) {
        this.email = email;
    }

    public UserData withEmail(Object email) {
        this.email = email;
        return this;
    }

    @JsonProperty("hireable")
    public Object getHireable() {
        return hireable;
    }

    @JsonProperty("hireable")
    public void setHireable(Object hireable) {
        this.hireable = hireable;
    }

    public UserData withHireable(Object hireable) {
        this.hireable = hireable;
        return this;
    }

    @JsonProperty("bio")
    public Object getBio() {
        return bio;
    }

    @JsonProperty("bio")
    public void setBio(Object bio) {
        this.bio = bio;
    }

    public UserData withBio(Object bio) {
        this.bio = bio;
        return this;
    }

    @JsonProperty("twitter_username")
    public Object getTwitterUsername() {
        return twitterUsername;
    }

    @JsonProperty("twitter_username")
    public void setTwitterUsername(Object twitterUsername) {
        this.twitterUsername = twitterUsername;
    }

    public UserData withTwitterUsername(Object twitterUsername) {
        this.twitterUsername = twitterUsername;
        return this;
    }

    @JsonProperty("public_repos")
    public Integer getPublicRepos() {
        return publicRepos;
    }

    @JsonProperty("public_repos")
    public void setPublicRepos(Integer publicRepos) {
        this.publicRepos = publicRepos;
    }

    public UserData withPublicRepos(Integer publicRepos) {
        this.publicRepos = publicRepos;
        return this;
    }

    @JsonProperty("public_gists")
    public Integer getPublicGists() {
        return publicGists;
    }

    @JsonProperty("public_gists")
    public void setPublicGists(Integer publicGists) {
        this.publicGists = publicGists;
    }

    public UserData withPublicGists(Integer publicGists) {
        this.publicGists = publicGists;
        return this;
    }

    @JsonProperty("followers")
    public Integer getFollowers() {
        return followers;
    }

    @JsonProperty("followers")
    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public UserData withFollowers(Integer followers) {
        this.followers = followers;
        return this;
    }

    @JsonProperty("following")
    public Integer getFollowing() {
        return following;
    }

    @JsonProperty("following")
    public void setFollowing(Integer following) {
        this.following = following;
    }

    public UserData withFollowing(Integer following) {
        this.following = following;
        return this;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public UserData withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UserData withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public UserData withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UserData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("login");
        sb.append('=');
        sb.append(((this.login == null)?"<null>":this.login));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("nodeId");
        sb.append('=');
        sb.append(((this.nodeId == null)?"<null>":this.nodeId));
        sb.append(',');
        sb.append("avatarUrl");
        sb.append('=');
        sb.append(((this.avatarUrl == null)?"<null>":this.avatarUrl));
        sb.append(',');
        sb.append("gravatarId");
        sb.append('=');
        sb.append(((this.gravatarId == null)?"<null>":this.gravatarId));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("htmlUrl");
        sb.append('=');
        sb.append(((this.htmlUrl == null)?"<null>":this.htmlUrl));
        sb.append(',');
        sb.append("followersUrl");
        sb.append('=');
        sb.append(((this.followersUrl == null)?"<null>":this.followersUrl));
        sb.append(',');
        sb.append("followingUrl");
        sb.append('=');
        sb.append(((this.followingUrl == null)?"<null>":this.followingUrl));
        sb.append(',');
        sb.append("gistsUrl");
        sb.append('=');
        sb.append(((this.gistsUrl == null)?"<null>":this.gistsUrl));
        sb.append(',');
        sb.append("starredUrl");
        sb.append('=');
        sb.append(((this.starredUrl == null)?"<null>":this.starredUrl));
        sb.append(',');
        sb.append("subscriptionsUrl");
        sb.append('=');
        sb.append(((this.subscriptionsUrl == null)?"<null>":this.subscriptionsUrl));
        sb.append(',');
        sb.append("organizationsUrl");
        sb.append('=');
        sb.append(((this.organizationsUrl == null)?"<null>":this.organizationsUrl));
        sb.append(',');
        sb.append("reposUrl");
        sb.append('=');
        sb.append(((this.reposUrl == null)?"<null>":this.reposUrl));
        sb.append(',');
        sb.append("eventsUrl");
        sb.append('=');
        sb.append(((this.eventsUrl == null)?"<null>":this.eventsUrl));
        sb.append(',');
        sb.append("receivedEventsUrl");
        sb.append('=');
        sb.append(((this.receivedEventsUrl == null)?"<null>":this.receivedEventsUrl));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("siteAdmin");
        sb.append('=');
        sb.append(((this.siteAdmin == null)?"<null>":this.siteAdmin));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("company");
        sb.append('=');
        sb.append(((this.company == null)?"<null>":this.company));
        sb.append(',');
        sb.append("blog");
        sb.append('=');
        sb.append(((this.blog == null)?"<null>":this.blog));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("hireable");
        sb.append('=');
        sb.append(((this.hireable == null)?"<null>":this.hireable));
        sb.append(',');
        sb.append("bio");
        sb.append('=');
        sb.append(((this.bio == null)?"<null>":this.bio));
        sb.append(',');
        sb.append("twitterUsername");
        sb.append('=');
        sb.append(((this.twitterUsername == null)?"<null>":this.twitterUsername));
        sb.append(',');
        sb.append("publicRepos");
        sb.append('=');
        sb.append(((this.publicRepos == null)?"<null>":this.publicRepos));
        sb.append(',');
        sb.append("publicGists");
        sb.append('=');
        sb.append(((this.publicGists == null)?"<null>":this.publicGists));
        sb.append(',');
        sb.append("followers");
        sb.append('=');
        sb.append(((this.followers == null)?"<null>":this.followers));
        sb.append(',');
        sb.append("following");
        sb.append('=');
        sb.append(((this.following == null)?"<null>":this.following));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}