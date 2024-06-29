// Generated by Karakum - do not modify it manually!

@file:JsModule("node:util")

package node.util

//// parseArgs
/**
 * Provides a higher level API for command-line argument parsing than interacting
 * with `process.argv` directly. Takes a specification for the expected arguments
 * and returns a structured object with the parsed options and positionals.
 *
 * ```js
 * import { parseArgs } from 'node:util';
 * const args = ['-f', '--bar', 'b'];
 * const options = {
 *   foo: {
 *     type: 'boolean',
 *     short: 'f',
 *   },
 *   bar: {
 *     type: 'string',
 *   },
 * };
 * const {
 *   values,
 *   positionals,
 * } = parseArgs({ args, options });
 * console.log(values, positionals);
 * // Prints: [Object: null prototype] { foo: true, bar: 'b' } []
 * ```
 * @since v18.3.0, v16.17.0
 * @param config Used to provide arguments for parsing and to configure the parser. `config` supports the following properties:
 * @return The parsed command line arguments:
 */
external fun <T : ParseArgsConfig> parseArgs(config: T = definedExternally): ParsedResults<T>
