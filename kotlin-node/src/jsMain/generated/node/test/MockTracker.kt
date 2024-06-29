// Generated by Karakum - do not modify it manually!

@file:JsModule("node:test")

package node.test

/**
 * The `MockTracker` class is used to manage mocking functionality. The test runner
 * module provides a top level `mock` export which is a `MockTracker` instance.
 * Each test also provides its own `MockTracker` instance via the test context's`mock` property.
 * @since v19.1.0, v18.13.0
 */
external class MockTracker {
    /**
     * This function is used to create a mock function.
     *
     * The following example creates a mock function that increments a counter by one
     * on each invocation. The `times` option is used to modify the mock behavior such
     * that the first two invocations add two to the counter instead of one.
     *
     * ```js
     * test('mocks a counting function', (t) => {
     *   let cnt = 0;
     *
     *   function addOne() {
     *     cnt++;
     *     return cnt;
     *   }
     *
     *   function addTwo() {
     *     cnt += 2;
     *     return cnt;
     *   }
     *
     *   const fn = t.mock.fn(addOne, addTwo, { times: 2 });
     *
     *   assert.strictEqual(fn(), 2);
     *   assert.strictEqual(fn(), 4);
     *   assert.strictEqual(fn(), 5);
     *   assert.strictEqual(fn(), 6);
     * });
     * ```
     * @since v19.1.0, v18.13.0
     * @param [original='A no-op function'] An optional function to create a mock on.
     * @param implementation An optional function used as the mock implementation for `original`. This is useful for creating mocks that exhibit one behavior for a specified number of calls and
     * then restore the behavior of `original`.
     * @param options Optional configuration options for the mock function. The following properties are supported:
     * @return The mocked function. The mocked function contains a special `mock` property, which is an instance of {@link MockFunctionContext}, and can be used for inspecting and changing the
     * behavior of the mocked function.
     */
    fun <F : Function<*> /* default is NoOpFunction */> fn(
        original: F = definedExternally,
        options: MockFunctionOptions = definedExternally,
    ): Mock<F>

    fun <F : Function<*> /* default is NoOpFunction */> fn(
        original: F = definedExternally,
        implementation: Function<*> = definedExternally,
        options: MockFunctionOptions = definedExternally,
    ): Mock<Function<*>>

    /**
     * This function is used to create a mock on an existing object method. The
     * following example demonstrates how a mock is created on an existing object
     * method.
     *
     * ```js
     * test('spies on an object method', (t) => {
     *   const number = {
     *     value: 5,
     *     subtract(a) {
     *       return this.value - a;
     *     },
     *   };
     *
     *   t.mock.method(number, 'subtract');
     *   assert.strictEqual(number.subtract.mock.calls.length, 0);
     *   assert.strictEqual(number.subtract(3), 2);
     *   assert.strictEqual(number.subtract.mock.calls.length, 1);
     *
     *   const call = number.subtract.mock.calls[0];
     *
     *   assert.deepStrictEqual(call.arguments, [3]);
     *   assert.strictEqual(call.result, 2);
     *   assert.strictEqual(call.error, undefined);
     *   assert.strictEqual(call.target, undefined);
     *   assert.strictEqual(call.this, number);
     * });
     * ```
     * @since v19.1.0, v18.13.0
     * @param object The object whose method is being mocked.
     * @param methodName The identifier of the method on `object` to mock. If `object[methodName]` is not a function, an error is thrown.
     * @param implementation An optional function used as the mock implementation for `object[methodName]`.
     * @param options Optional configuration options for the mock method. The following properties are supported:
     * @return The mocked method. The mocked method contains a special `mock` property, which is an instance of {@link MockFunctionContext}, and can be used for inspecting and changing the
     * behavior of the mocked method.
     */
    fun method(target: Any, methodName: String, options: MockFunctionOptions = definedExternally): Mock<Function<*>>
    fun method(
        target: Any,
        methodName: String,
        implementation: Function<*>,
        options: MockFunctionOptions = definedExternally,
    ): Mock<Function<*>>

    fun method(target: Any, methodName: String, options: MockMethodOptions): Mock<Function<*>>
    fun method(
        target: Any,
        methodName: String,
        implementation: Function<*>,
        options: MockMethodOptions,
    ): Mock<Function<*>>

    /**
     * This function is syntax sugar for `MockTracker.method` with `options.getter`set to `true`.
     * @since v19.3.0, v18.13.0
     */
    fun getter(target: Any, methodName: String, options: MockFunctionOptions = definedExternally): Mock<() -> Any?>
    fun getter(
        target: Any,
        methodName: String,
        implementation: Function<*> = definedExternally,
        options: MockFunctionOptions = definedExternally,
    ): Mock<Function<*>>

    /**
     * This function is syntax sugar for `MockTracker.method` with `options.setter`set to `true`.
     * @since v19.3.0, v18.13.0
     */
    fun setter(
        target: Any,
        methodName: String,
        options: MockFunctionOptions = definedExternally,
    ): Mock<(value: Any?) -> Unit>

    fun setter(
        target: Any,
        methodName: String,
        implementation: Function<*> = definedExternally,
        options: MockFunctionOptions = definedExternally,
    ): Mock<Function<*>>

    /**
     * This function restores the default behavior of all mocks that were previously
     * created by this `MockTracker` and disassociates the mocks from the`MockTracker` instance. Once disassociated, the mocks can still be used, but the`MockTracker` instance can no longer be
     * used to reset their behavior or
     * otherwise interact with them.
     *
     * After each test completes, this function is called on the test context's`MockTracker`. If the global `MockTracker` is used extensively, calling this
     * function manually is recommended.
     * @since v19.1.0, v18.13.0
     */
    fun reset(): Unit

    /**
     * This function restores the default behavior of all mocks that were previously
     * created by this `MockTracker`. Unlike `mock.reset()`, `mock.restoreAll()` does
     * not disassociate the mocks from the `MockTracker` instance.
     * @since v19.1.0, v18.13.0
     */
    fun restoreAll(): Unit
    var timers: MockTimers
}
