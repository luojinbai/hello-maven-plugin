package com.yibai.maven.plugins;

import java.io.File;
import java.util.List;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * Created by yibai on 2019/2/27.
 */
@Mojo(name = "hello", defaultPhase = LifecyclePhase.INSTALL)
public class HelloMojo extends AbstractMojo {

	@Parameter(property = "baseDir")
	private String baseDir;
	@Parameter(property = "projectBuildDirectory")
	private String projectBuildDirectory;
	@Parameter(property = "name")
	private String name;

	@Parameter(property = "maven.compiler.source", defaultValue = "1.5")
	protected String source;
	@Parameter(property = "maven.compiler.target", defaultValue = "1.5")
	protected String target;

	@Parameter(defaultValue = "${project.compileSourceRoots}", readonly = true, required = true)
	private List<String> compileSourceRoots;

	@Parameter(defaultValue = "${project.compileClasspathElements}", readonly = true, required = true)
	private List<String> classpathElements;

	@Parameter(defaultValue = "${project.build.outputDirectory}", required = true, readonly = true)
	private File outputDirectory;

	@Parameter(defaultValue = "${project.testCompileSourceRoots}", readonly = true, required = true)
	private List<String> testCompileSourceRoots;

	@Parameter(defaultValue = "${project.testClasspathElements}", required = true, readonly = true)
	private List<String> testClasspathElements;

	@Parameter(defaultValue = "${project.build.testOutputDirectory}", required = true, readonly = true)
	private File testOutputDirectory;

	public void execute() throws MojoExecutionException, MojoFailureException {
		System.out.println("hello maven plugin");
		System.out.println("baseDir: " + baseDir);
		System.out.println("projectBuildDirectory: " + projectBuildDirectory);
		System.out.println("name: " + name);

		System.out.println("source: " + source);
		System.out.println("target: " + target);

		System.out.println("compileSourceRoots: " + compileSourceRoots);
		System.out.println("classpathElements: " + classpathElements);
		System.out.println("outputDirectory: " + outputDirectory);
		System.out.println("testCompileSourceRoots: " + testCompileSourceRoots);
		System.out.println("testClasspathElements: " + testClasspathElements);
		System.out.println("testOutputDirectory: " + testOutputDirectory);
	}
}
