import java.io.File;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Component;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.project.MavenProject;
import org.jboss.forge.roaster.model.JavaUnit;

@Mojo(name="sampleMojo")
public class SampleMojo extends AbstractMojo{

	@Component
	private MavenProject project;
	
	public void execute() throws MojoExecutionException, MojoFailureException {
//		List<String> classpathElements = null;
//	    try {
//	        classpathElements = project.getCompileClasspathElements();
//	        List<URL> projectClasspathList = new ArrayList<URL>();
//	        for (String element : classpathElements) {
//	            try {
//	                projectClasspathList.add(new File(element).toURI().toURL());
//	            } catch (MalformedURLException e) {
//	                throw new MojoExecutionException(element + " is an invalid classpath element", e);
//	            }
//	        }
//	        Set<URL> hash = new HashSet<URL>(projectClasspathList);
//	        
//	        URLClassLoader loader = new URLClassLoader(projectClasspathList.toArray(new URL[0]));
//	        
////	        Reflections ref = new Reflections(new ConfigurationBuilder()
////	                .setScanners(new SubTypesScanner(), new ResourcesScanner())
////	                .setUrls(projectClasspathList)
////	                .addClassLoader(loader));
//	        Reflections ref = new Reflections("com.ralen");
//	        System.out.println(ref.getSubTypesOf(Object.class).size());
//	    } catch (DependencyResolutionRequiredException e) {
//	        new MojoExecutionException("Dependency resolution failed", e);
//	    }
		File file = project.getBasedir();
		listFilesForFolder(file);
		JavaUnit u;
		u.
		
		
	}
	
	public void listFilesForFolder(final File folder) {
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	            listFilesForFolder(fileEntry);
	        } else {
	            System.out.println(fileEntry.getName());
	        }
	    }
	}

}
