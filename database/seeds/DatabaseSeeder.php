<?php

use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

class DatabaseSeeder extends Seeder
{
    /**
     * Seed the application's database.
     *
     * @return void
     */
    public function run()
    {
        // $this->call(UsersTableSeeder::class);
        Model::unguard();

    // use the faker library to mock some data
    $faker = Faker::create();

    // create 30 articles
    foreach(range(1, 30) as $index) {
        Article::create([
            'title' => $faker->sentence(5),
            'content' => $faker->paragraph(6)
        ]);
    }

    Model::reguard();
    }
}
