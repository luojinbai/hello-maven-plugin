package com.yibai.maven.plugins;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * Created by yibai on 2019/2/27.
 */
@Mojo(name = "hello",defaultPhase = LifecyclePhase.INSTALL)
public class HelloMojo extends AbstractMojo {

    @Parameter(property = "baseDir")
    private String baseDir;
    @Parameter(property = "projectBuildDirectory")
    private String projectBuildDirectory;
    @Parameter(property = "name")
    private String name;

    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("hello maven plugin");
        System.out.println("baseDir: " + baseDir);
        System.out.println("projectBuildDirectory: " + projectBuildDirectory);
        System.out.println("name: " + name);

    }
}
