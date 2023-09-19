package com.migueljo.jobsearch;

import com.beust.jcommander.JCommander;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class CommanderFunctions {
	static <T> JCommander buildCommanderWithName(String cliName, Supplier<T> argumentSupplier) {
		JCommander jCommander = JCommander.newBuilder()
						.addCommand(argumentSupplier.get())
						.build();
		jCommander.setProgramName(cliName);
		return jCommander;
	}

	static Optional<List<Object>> parseArguments(
					JCommander jCommander,
					String[] arguments,
					Consumer<JCommander> onError
	) {

	}
}
