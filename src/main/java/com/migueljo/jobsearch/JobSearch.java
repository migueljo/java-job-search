package com.migueljo.jobsearch;

import com.beust.jcommander.JCommander;
import com.migueljo.jobsearch.cli.CLIArguments;

import static com.migueljo.jobsearch.CommanderFunctions.buildCommanderWithName;

public class JobSearch {
	public static void main(String[] args) {
		System.out.println("JobSearch.main");
		JCommander jCommander = buildCommanderWithName("job-search", CLIArguments::newInstance);
		System.out.println(jCommander);
	}
}
