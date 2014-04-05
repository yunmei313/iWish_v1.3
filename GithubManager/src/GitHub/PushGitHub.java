package GitHub;

import java.util.Arrays;
import java.util.List;

import org.eclipse.jgit.errors.ConfigInvalidException;
import org.eclipse.jgit.lib.Config;


public class PushGitHub {
	private Config config;
        

 	public void setUp() throws Exception {
        	config = new Config();
  	}

        


	
	RepositoryService service = new RepositoryService();
	service.getClient().setCredentials("username from node.js", "password from node.js");
	RepositoryId toBeForked = new RepositoryId("repo_name", "repo_name");
	service.forkRepository(toBeForked);
}
        
public void addURI() throws Exception {

        final URIish git_uri = new URIish("D://tintin/github_test");
              
        
	final RemoteConfig remote = new RemoteConfig(config, "origin");
             
	if(remote.addURI(git_uri)){
		this.createOriginal(remote);
	}      
}

public createOriginal(RemoteConfig remote){
	remote.addFetchRefSpec(new RefSpec("+refs/heads/*:refs/remotes/"
                    + remote.getName() + "/*"));
        remote.update(config);
}

public void UploadDir() throws Exception {

	final RemoteConfig rc = new RemoteConfig(config, "example");
	final List<URIish> allURIs = rc.getURIs();
	RefSpec spec;

	rc.getFetchRefSpecs();
	rc.getPushRefSpecs();

	rc.getUploadPack();
	rc.getReceivePack();
}