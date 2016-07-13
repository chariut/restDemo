package maven.git;


/**
* A spring controlled bean that will be injected
* with properties about the repository state at build time.
* This information is supplied by my plugin - <b>pl.project13.maven.git-commit-id-plugin</b>
*/
public class GitRepositoryState {
	String tags;                    // =${git.tags} // comma separated tag names
	  String branch;                  // =${git.branch}
	  String dirty;                   // =${git.dirty}
	  String remoteOriginUrl;         // =${git.remote.origin.url}

	  String commitId;                // =${git.commit.id.full} OR ${git.commit.id}
	  String commitIdAbbrev;          // =${git.commit.id.abbrev}
	  String describe;                // =${git.commit.id.describe}
	  String describeShort;           // =${git.commit.id.describe-short}
	  String commitUserName;          // =${git.commit.user.name}
	  String commitUserEmail;         // =${git.commit.user.email}
	  String commitMessageFull;       // =${git.commit.message.full}
	  String commitMessageShort;      // =${git.commit.message.short}
	  String commitTime;              // =${git.commit.time}
	  String closestTagName;          // =${git.closest.tag.name}
	  String closestTagCommitCount;   // =${git.closest.tag.commit.count}

	  String buildUserName;           // =${git.build.user.name}
	  String buildUserEmail;          // =${git.build.user.email}
	  String buildTime;               // =${git.build.time}
	  String buildHost;               // =${git.build.host}
	  String buildVersion;             // =${git.build.version}
	  public GitRepositoryState() {
	  }
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getDirty() {
		return dirty;
	}
	public void setDirty(String dirty) {
		this.dirty = dirty;
	}
	public String getRemoteOriginUrl() {
		return remoteOriginUrl;
	}
	public void setRemoteOriginUrl(String remoteOriginUrl) {
		this.remoteOriginUrl = remoteOriginUrl;
	}
	public String getCommitId() {
		return commitId;
	}
	public void setCommitId(String commitId) {
		this.commitId = commitId;
	}
	public String getCommitIdAbbrev() {
		return commitIdAbbrev;
	}
	public void setCommitIdAbbrev(String commitIdAbbrev) {
		this.commitIdAbbrev = commitIdAbbrev;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public String getDescribeShort() {
		return describeShort;
	}
	public void setDescribeShort(String describeShort) {
		this.describeShort = describeShort;
	}
	public String getCommitUserName() {
		return commitUserName;
	}
	public void setCommitUserName(String commitUserName) {
		this.commitUserName = commitUserName;
	}
	public String getCommitUserEmail() {
		return commitUserEmail;
	}
	public void setCommitUserEmail(String commitUserEmail) {
		this.commitUserEmail = commitUserEmail;
	}
	public String getCommitMessageFull() {
		return commitMessageFull;
	}
	public void setCommitMessageFull(String commitMessageFull) {
		this.commitMessageFull = commitMessageFull;
	}
	public String getCommitMessageShort() {
		return commitMessageShort;
	}
	public void setCommitMessageShort(String commitMessageShort) {
		this.commitMessageShort = commitMessageShort;
	}
	public String getCommitTime() {
		return commitTime;
	}
	public void setCommitTime(String commitTime) {
		this.commitTime = commitTime;
	}
	public String getClosestTagName() {
		return closestTagName;
	}
	public void setClosestTagName(String closestTagName) {
		this.closestTagName = closestTagName;
	}
	public String getClosestTagCommitCount() {
		return closestTagCommitCount;
	}
	public void setClosestTagCommitCount(String closestTagCommitCount) {
		this.closestTagCommitCount = closestTagCommitCount;
	}
	public String getBuildUserName() {
		return buildUserName;
	}
	public void setBuildUserName(String buildUserName) {
		this.buildUserName = buildUserName;
	}
	public String getBuildUserEmail() {
		return buildUserEmail;
	}
	public void setBuildUserEmail(String buildUserEmail) {
		this.buildUserEmail = buildUserEmail;
	}
	public String getBuildTime() {
		return buildTime;
	}
	public void setBuildTime(String buildTime) {
		this.buildTime = buildTime;
	}
	public String getBuildHost() {
		return buildHost;
	}
	public void setBuildHost(String buildHost) {
		this.buildHost = buildHost;
	}
	public String getBuildVersion() {
		return buildVersion;
	}
	public void setBuildVersion(String buildVersion) {
		this.buildVersion = buildVersion;
	}
	@Override
	public String toString() {
		return "GitRepositoryState [tags=" + tags + ", branch=" + branch + ", dirty=" + dirty + ", remoteOriginUrl="
				+ remoteOriginUrl + ", commitId=" + commitId + ", commitIdAbbrev=" + commitIdAbbrev + ", describe="
				+ describe + ", describeShort=" + describeShort + ", commitUserName=" + commitUserName
				+ ", commitUserEmail=" + commitUserEmail + ", commitMessageFull=" + commitMessageFull
				+ ", commitMessageShort=" + commitMessageShort + ", commitTime=" + commitTime + ", closestTagName="
				+ closestTagName + ", closestTagCommitCount=" + closestTagCommitCount + ", buildUserName="
				+ buildUserName + ", buildUserEmail=" + buildUserEmail + ", buildTime=" + buildTime + ", buildHost="
				+ buildHost + ", buildVersion=" + buildVersion + "]";
	}
	  

}
